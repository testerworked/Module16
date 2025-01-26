package com.homework.freeaccess

/**
 * Приложение «Открытый доступ».
 *
 *          Необходимо написать приложение для получения доступа по двум типам разрешений:
 *
 * <uses-permission android:name="android.permission.CAMERA" />
 *
 * <uses-permission android:name="android.permission.READ_CONTACTS" />
 *
 *          Для получения вышеуказанных разрешений на находятся две кнопки
 *          (вид кнопки на выбор: floatingActionButton, Button, ToggleButton и тд)
 *
 *          При получении доступа к камере, выполняется переход на новый экран,
 *          на котором находится любая картинка (имитация сделанного фото).
 *
 *          При получении доступа к контактам, выполняется переход на экран контактов
 *          на котором располагается RecyclerVeiw, в который передается список созданных контактов.
 *          Список контактов необходимо создать самостоятельно. Элемент списка содержит: имя и телефон.
 *
 * Необходимо предусмотреть создание класса элемента списка с соответствующими
 * элементами этого списка для создания адаптера.
 *
 *
 *          На каждом экране есть Toolbar и порядок выхода через пункт меню.
 *
 * Для работы приложения необходимо создать:
 *
 * На первом экране:
 *
 * 1.     Toolbar.
 *
 * 2.     Меню с пунктом выхода из приложения «Exit».
 *
 * 3.     Две кнопки для получения разрешений и перехода к последующим экранам.
 *
 * На экране фотокамеры:
 *
 * 1.     Toolbar.
 *
 * 2.     Меню с пунктом выхода из приложения «Exit».
 *
 * 3.     ImageView с картинкой сделанного фото (любая картинка).
 *
 * На экране контактов:
 *
 * 1.     Toolbar.
 *
 * 2.     Меню с пунктом выхода из приложения «Exit».
 *
 * 3.     RecyclerVeiw со списком контактов.
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