package com.example.lab3_zhanserik

object MainStrings {
    // Здесь переменные которые очень важны, так как здесь есть пароль и имена, с которыми ты можешь войти в систему
    const val LoginName = "root"
    const val LoginName1 = "zhans"
    const val LoginPassword = "2133"
    const val keyNewValue = "zhans"

    // Это ключ, который мы использовали для передачи и получение данных(айдишки)
    const val key = "zhans"

    // Здесь переменные которые часто используются в коде, это нужно для простоты использования
    const val Location = "Kazakstan - Almaty"
    const val Marital_Yes = "Yes"
    const val Marital_No = "No"

    const val FullName = "Full name: "
    const val Birth_date = "Birth date: "
    const val Phone_num = "Phone: "
    const val Email = "Email: "
    const val Address = "Address: "
    const val Marital = "Marital status: "
    const val Add_Info = "Additional info: "

}

// Здесь хранится наши айдишки, для поиска
object Names {
    const val Amiruldayev_Emil = 30663
    const val Aripzhan_Parviz = 30662
    const val Balzhan_Bakbergenova = 30660
    const val Mirlan_Daiyn  = 30646
    const val Arailym_Bekasyl = 30645
    const val Aisha_Berkinkyzy = 30649
    const val Daniya_Ashimova = 30659
    const val Erkhan_Djoldasov = 30664
    const val Nurzhan_Zhilisbayev = 30661
    const val Meirambek_Imash = 30702
    const val Alikhan_Mutalyap = 30656
    const val Ruslan_Mukhituly = 30650
    const val Daniyar_Nurpeissov = 30655
    const val Kuanysh_Omarov = 30706
    const val Zhanserik_Rakhmetuly = 30657
    const val Dastan_Smagul = 30652
    const val Aigerim_Sultangazy = 30651
    const val Zhadiger_Tailakbayev = 30654
    const val Erkebulan_Toktaev = 30536
    const val Dulat_Umbetay = 30648
    const val Adilmurat_Shayakhmet = 30647
}

data class Student(
    var id: Int,
    var name: String,
    var group: String,
    var date: String,
    var phoneNumber: String,
    var email: String
)
var students = mutableListOf(
    Student(30663, "Emill Amiruldayev", "SIS2119", "30.03.2003", "+7 708 564 10 05", "abayrakhat@icloud.com"),
    Student(30662, "Parviz Aripzhan", "SIS2119", "27.06.2004", "+7 700 447 00 00", "bekarystan_abunasyr@icloud.com"),
    Student(30660, "Ashimova Daniya", "SIS2119", "01.06.2004", "+7 707 707 70 07", "boranbaev_nurzhasar@icloud.com"),
    Student(30646, "Bakbergenova Balzhan", "SIS2119", "22.07.2003", "+7 708 179 96 80", "dauletbaev_askar@gmail.com"),
    Student(30645, "Bekasyl Arailym", "SIS2119", "21.03.2003", "+7 775 137 84 42", "elubaev_diyas@icloud.com"),
    Student(30649, "Berkinkyzy Aisha", "SIS2119", "26.03.2003", "+7 747 945 40 39", "yergesh_ayazhan@icloud.com"),
    Student(30659, "Daiyn Mirlan", "SIS2119", "18.03.2004", "+7 700 684 88 75", "idialov_aldiyar@gmail.com"),
    Student(30664, "Djoldasov Erkhan", "SIS2119", "15.09.2004", "+7 747 321 64 88", "ismail_farkhat@gmail.com"),
    Student(30661, "Zhilisbayev Nurzhan", "SIS2119", "05.02.2004", "+7 747 321 64 88", "karimov_sherkhan@gmail.com"),
    Student(30665, "Imash Meirambek", "SIS2119", "20.01.2004", "+7 705 368 35 58", "kenzhebay_symbat@icloud.com"),
    Student(30656, "Mutalyap Alikhan", "SIS2119", "22.01.2004", "+7 702 189 22 19", "kobetay_beksultan@icloud.com"),
    Student(30650, "Mukhituly Ruslan", "SIS2119", "09.04.2004", "+7 708 225 04 29", "kazybek_moldir@icloud.com"),
    Student(30655, "Nurpeissov Daniyar", "SIS2119", "04.05.2004", "+7 775 938 70 04", "kaltay_nurkali@icloud.com"),
    Student(30706, "Omarov Kuanysh", "SIS2119", "03.07.2004", "+7 705 750 91 42", "kasumkulov_nurbek@gmail.com"),
    Student(30657, "Rakhmetuly Zhanserik", "SIS2119", "07.08.2004", "+7 707 995 07 06", "mukhametkali_alibek@icloud.com"),
    Student(30652, "Smagul Dastan", "SIS2119", "11.05.2003", "+7 708 632 05 61", "nurmukhanov_elnur@gmail.com"),
    Student(30651, "Sultangazy Aigerim", "SIS2119", "30.12.2004", "+7 700 301 20 47", "rakyzhanova_togzhan@icloud.com"),
    Student(30654, "Tailakbayev Zhadiger", "SIS2119", "01.10.2003", "+7 707 445 09 67", "sarsenbay_azat@gmail.com"),
    Student(30536, "Toktaev Erkebulan", "SIS2119", "23.02.2004", "+7 705 339 39 16", "seksenbaeva_erkezhan@icloud.com"),
    Student(30648, "Umbetay Dulat", "SIS2119", "04.04.2004", "+7 778 883 37 78", "turtaev_temirlan@gmail.com"))