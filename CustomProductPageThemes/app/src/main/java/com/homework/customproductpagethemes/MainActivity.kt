package com.homework.customproductpagethemes

/**
 * Приложение «Кастомные темы страницы товара»
 *
 *          Необходимо написать приложение с одним экраном,
 *          на котором располагается изображение товара, его название,
 *          описание и кнопка «Купить». Для работы приложения и демонстрации смены
 *          тем необходимо создать две кастомные темы: светлую и темную. Они должны
 *          меняться в зависимости от установленной темы устройства. Необходимо учесть,
 *          что при переключении обеих тем, текст должен оставаться читаемым, цветовая
 *          гамма приложения должна быть гармонично выстроена
 *          (т.е. при переключении на темную тему, кнопка, которая задана
 *          в темных тонах при светлой теме, должна быть видна и т.д).
 *
 * Для работы приложения необходимо создать:
 *
 * На экране:
 *
 * 1.     ImageView картинки товара.
 *
 * 2.     TextView названия товара.
 *
 * 3.     TextView описания товара.
 *
 * 4.     Кнопка «Купить».
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