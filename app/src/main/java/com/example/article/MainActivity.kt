package com.example.article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        articleTitle = stringResource(id = R.string.название_статьи),
                        firstParagraph = stringResource(
                            id = R.string.текст_1
                        ),
                        secondParagraph = stringResource(id = R.string.текст_2)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText (articleTitle: String,firstParagraph: String, secondParagraph: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ){
        Text(
            text = articleTitle,
            fontSize = 100.sp,
            lineHeight = 116.sp,
        )
        Text(
            text = firstParagraph,
            fontSize = 36.sp,

            )
        Text(
            text = secondParagraph,
            fontSize = 36.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Article() {
    ArticleTheme {
        GreetingText(articleTitle = stringResource(R.string.название_статьи), firstParagraph = stringResource(
            R.string.текст_1
        ), secondParagraph = stringResource(R.string.текст_2))
    }
}