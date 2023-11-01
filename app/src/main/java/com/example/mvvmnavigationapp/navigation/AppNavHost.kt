package com.example.mvvmnavigationapp.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigationapp.ui.theme.screens.about.AboutScreen
import com.example.mvvmnavigationapp.ui.theme.screens.home.HomeScreen
import com.example.mvvmnavigationapp.ui.theme.screens.login.LoginScreen
import com.example.mvvmnavigationapp.ui.theme.screens.products.ProductsScreen
import com.example.mvvmnavigationapp.ui.theme.screens.signup.SignupScreen

@SuppressLint("ComposableDestinationInComposeScope")
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUTE_HOME
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ){
        composable(ROUTE_HOME){
            HomeScreen(navController = navController)
            
        composable(ROUTE_ABOUT){
            AboutScreen(navController = navController)    
            
        composable(ROUTE_PRODUCTS){
            ProductsScreen(navController = navController)
            
        composable(ROUTE_SIGNUP){
            SignupScreen(navController = navController)
            
        composable(ROUTE_LOGIN){
            LoginScreen(navController = navController)
        }
        }
        }   
            
            
            }
        }
    }
}
