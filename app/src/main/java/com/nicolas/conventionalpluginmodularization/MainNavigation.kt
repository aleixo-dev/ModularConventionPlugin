package com.nicolas.conventionalpluginmodularization

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.nicolas.details.DetailsRoute
import com.nicolas.home.HomeRoute
import com.nicolas.navigation.Details
import com.nicolas.navigation.Home
import java.util.UUID

@Composable
fun MainNavigation(
    navController: NavHostController = rememberNavController()
) {

    NavHost(navController = navController, startDestination = Home) {
        composable<Home> {
            HomeRoute(onNavigateDetails = {
                navController.navigate(
                    Details(
                        id = UUID.randomUUID().toString(),
                        "Aleixo-Dev"
                    )
                )
            })
        }
        composable<Details> { backStackEntry ->
            val details = backStackEntry.toRoute<Details>()
            DetailsRoute(details)
        }
    }
}