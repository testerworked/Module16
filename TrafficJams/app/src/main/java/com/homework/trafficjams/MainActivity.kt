package com.homework.trafficjams

/**
 * Приложение «Пробки»
 *
 *         Необходимо написать приложение, используя библиотеку YandexMapKit,
 *         определяющее местоположение на карте с установкой метки по текущим координатам
 *         и показывающим загруженность автомобильных дорог в текущий момент времени.
 *         Приложение состоит из двух экранов. После запуска стартового экрана,
 *         через 5 секунд выполняется переход на основной экран с картой,
 *         на котором исполняется приближение к месту с текущими
 *         координатами и постановкой метки. На экране располагается кнопка,
 *         по нажатию на которую можно наблюдать «пробки» на дорогах.
 *         Часть логики используется согласно тематике отработанного занятия.
 *         Определение места по текущим координатам и загруженность автомобильных
 *         дорог необходимо изучить самостоятельно. Используемые ресурсы интернета:
 *         https://yandex.ru/dev/mapkit/doc/ru/ или другие.
 *         Для работы приложения необходимо создать:
 * На первом экране:
 * 1.    TextView называния приложения.
 * На втором экране:
 * 1.    MapView для отображения карты.
 * 2.    Floating action button (FAB) загрузки автомобильных «пробок».
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