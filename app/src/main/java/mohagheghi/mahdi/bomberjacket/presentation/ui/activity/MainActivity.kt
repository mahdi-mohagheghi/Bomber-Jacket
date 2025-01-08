package mohagheghi.mahdi.bomberjacket.presentation.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mohagheghi.mahdi.bomberjacket.presentation.ui.screen.CartScreen
import mohagheghi.mahdi.bomberjacket.presentation.ui.screen.DiscoverScreen
import mohagheghi.mahdi.bomberjacket.presentation.ui.screen.IntroScreen
import mohagheghi.mahdi.bomberjacket.presentation.ui.screen.NavRoutes
import mohagheghi.mahdi.bomberjacket.presentation.ui.screen.ProductDetailScreen
import mohagheghi.mahdi.bomberjacket.presentation.ui.theme.BomberJacketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BomberJacketTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(navController = navController, innerPadding = innerPadding)
                }
            }
        }
    }
}

@Composable
fun NavHost(navController: NavHostController, innerPadding: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = NavRoutes.Intro.name,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable(route = NavRoutes.Intro.name) {
            IntroScreen(onIntroPassed = {
                navController.navigate(NavRoutes.Discover.name)
            })
        }

        composable(route = NavRoutes.Discover.name) {
            DiscoverScreen(onProductClicked = { product ->
                navController.navigate(NavRoutes.ProductDetail.name)
            })
        }

        composable(route = NavRoutes.ProductDetail.name) {
            ProductDetailScreen(onBack = {
                navController.popBackStack()
            })
        }

        composable(route = NavRoutes.Cart.name) {
            CartScreen(onBack = {
                navController.popBackStack()
            })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BomberJacketTheme {

    }
}