package com.homework.mydimensionstyles

/**
 * Создание своих размеров и стилей.
 *
 * Необходимо создать свои градации размеров текстов с таким расчетом,
 * что стандартным размером считать размер текста – 16 sp.
 * Необходимо создать свои размеры внутренних и внешних отступов:
 * с левой и с правой сторон, сверху и снизу, а также одновременно – общих.
 * За стандарт отступа принимать значение равное 16 dp.
 *
 * Создать стили текстовых полей вывода: заголовки, подзаголовки,
 * основной текст описания чего-либо; текстовых полей ввода, создать стиль кнопки.
 *
 * В папке ресурсов цвета создать палитру своих цветов.
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