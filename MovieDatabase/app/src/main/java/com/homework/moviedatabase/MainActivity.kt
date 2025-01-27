package com.homework.moviedatabase

/**
 *         Приложение «База данных кино»
 *
 * Необходимо написать приложение получения списка фильмов из интернет -
 * ресурса https://www.themoviedb.org/ (можно использовать любой другой).
 *
 * Важно: Для корректной работы с этим сервисом для получения API_KEY
 * и формата запросов, входить в него нужно через любой удобный вам ВПН клиент.
 * В ином случае - сервер обрывает соединение.
 *
 * Приложение необходимо написать с использованием библиотеки Paging 3,
 * функционал частично схож с тем, что отрабатывали на занятии.
 *
 * Предпочтительно использование библиотеки внедрения зависимостей Dagger Hilt.
 * Фактически приложение должно получиться, как комплексное на основе предыдущей и настоящей тем.
 *
 * Кроме того, архитектура приложения должна быть выстроена на основе паттерна
 *
 *
 */
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}