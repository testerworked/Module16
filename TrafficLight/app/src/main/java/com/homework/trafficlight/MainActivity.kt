package com.homework.trafficlight

/**
 * Приложение «Светофор»
 *
 *          Необходимо написать приложение, имитирующее работу светофора.
 *          На главном экране находятся три кнопки: «Красный», «Желтый», «Зеленый».
 *          При нажатии на любую из них выполняется переход на фрагмент соответствующего цвета
 *          с текстовым сообщением в центре экрана: «Красный» - «Стой!»,
 *          «Желтый» - «Внимание!», «Зеленый» - «Движение разрешено!»
 *
 *          По- возможности текст из соответствующей кнопки после нажатия на нее анимировано
 *          перемещается на фрагмент. Т.е. нажали на кнопку «Стой!» красного цвета,
 *          текст «Стой!» переместился с анимацией во фрагмент красного цвета в центр экрана.
 *
 *          Переход с одного фрагмента на другой необходимо реализовать с помощью анимации.
 *
 *          Перемещение между экранами приложения необходимо реализовать с помощью
 *          Navigation Architecture Component согласно тематике отработанного занятия.
 *
 * Для работы приложения необходимо создать:
 *
 * На первом экране:
 *
 * 1.     Toolbar c заголовком названия приложения.
 *
 * 2.     Три кнопки «Красный», «Желтый», «Зеленый», расположенные вертикально друг под другом.
 *
 * 3.     Меню с пунктом выхода из приложения.
 *
 * На экранах светофора:
 *
 * 1.     Toolbar c заголовком названия приложения и кнопкой «Назад»
 *
 * 2.     Поле вывода текстового сообщения соответствующего цвета светофора.
 *
 * 3.     Меню с пунктом выхода из приложения.
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