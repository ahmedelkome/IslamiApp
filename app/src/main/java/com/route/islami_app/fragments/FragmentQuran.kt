package com.route.islami_app.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.islami_app.adapters.SuraNameAdapter
import com.route.islami_app.constants.Constants
import com.route.islami_app.databinding.FragmentQuranBinding
import com.route.islami_app.module.Sura
import com.route.islami_app.screens.quran.SuraContentActivity


class FragmentQuran : Fragment() {
    lateinit var binding: FragmentQuranBinding
    lateinit var adapter: SuraNameAdapter

    var suraContent = ArrayList<Sura>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentQuranBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createData()
        initRecycler()
    }

    private fun createData() {
        suraContent.add(Sura("الفاتحه",7))
        suraContent.add(Sura("البقرة",286))
        suraContent.add(Sura("آل عمران",200))
        suraContent.add(Sura("النساء",200))
        suraContent.add(Sura("المائدة",120))
        suraContent.add(Sura("الأنعام",165))
        suraContent.add(Sura("الأعراف",206))
        suraContent.add(Sura("الأنفال",75))
        suraContent.add(Sura("التوبة",129))
        suraContent.add(Sura("يونس",109))
        suraContent.add(Sura("هود",123))
        suraContent.add(Sura("يوسف",111))
        suraContent.add(Sura("الرعد",43))
        suraContent.add(Sura("إبراهيم",52))
        suraContent.add(Sura("الحجر",99))
        suraContent.add(Sura("النحل",128))
        suraContent.add(Sura("الإسراء",111))
        suraContent.add(Sura("الكهف",110))
        suraContent.add(Sura("مريم",98))
        suraContent.add(Sura("طه",135))
        suraContent.add(Sura("الأنبياء",112))
        suraContent.add(Sura("الحج",78))
        suraContent.add(Sura("المؤمنون",118))
        suraContent.add(Sura("النور",64))
        suraContent.add(Sura("الفرقان",77))
        suraContent.add(Sura("الشعراء",227))
        suraContent.add(Sura("النمل",93))
        suraContent.add(Sura("القصص",88))
        suraContent.add(Sura("العنكبوت",69))
        suraContent.add(Sura("الروم",60))
        suraContent.add(Sura("لقمان",34))
        suraContent.add(Sura("السجدة",30))
        suraContent.add(Sura("الأحزاب",73))
        suraContent.add(Sura("سبأ",54))
        suraContent.add(Sura("فاطر",45))
        suraContent.add(Sura("يس",83))
        suraContent.add(Sura("الصافات",182))
        suraContent.add(Sura("ص",88))
        suraContent.add(Sura("الزمر",75))
        suraContent.add(Sura("غافر",85))
        suraContent.add(Sura("فصلت",54))
        suraContent.add(Sura("الشورى",53))
        suraContent.add(Sura("الزخرف",89))
        suraContent.add(Sura("الدخان",59))
        suraContent.add(Sura("الجاثية",37))
        suraContent.add(Sura("الأحقاف",35))
        suraContent.add(Sura("محمد",38))
        suraContent.add(Sura("الفتح",29))
        suraContent.add(Sura("الحجرات",18))
        suraContent.add(Sura("ق",45))
        suraContent.add(Sura("الذاريات",60))
        suraContent.add(Sura("الطور",49))
        suraContent.add(Sura("النجم",62))
        suraContent.add(Sura("القمر",55))
        suraContent.add(Sura("الرحمن",78))
        suraContent.add(Sura("الواقعة",96))
        suraContent.add(Sura("الحديد",29))
        suraContent.add(Sura("المجادلة",22))
        suraContent.add(Sura("الحشر",24))
        suraContent.add(Sura("الممتحنة",13))
        suraContent.add(Sura("الصف",14))
        suraContent.add(Sura("الجمعة",11))
        suraContent.add(Sura("المنافقون",11))
        suraContent.add(Sura("التغابن",18))
        suraContent.add(Sura("الطلاق",12))
        suraContent.add(Sura("التحريم",12))
        suraContent.add(Sura("الملك",30))
        suraContent.add(Sura("القلم",52))
        suraContent.add(Sura("الحاقة",52))
        suraContent.add(Sura("المعارج",44))
        suraContent.add(Sura("نوح",28))
        suraContent.add(Sura("الجن",28))
        suraContent.add(Sura("المزمل",20))
        suraContent.add(Sura("المدثر",56))
        suraContent.add(Sura("القيامة",40))
        suraContent.add(Sura("الإنسان",31))
        suraContent.add(Sura("المرسلات",50))
        suraContent.add(Sura("النبأ",40))
        suraContent.add(Sura("النازعات",64))
        suraContent.add(Sura("عبس",42))
        suraContent.add(Sura("التكوير",29))
        suraContent.add(Sura("الإنفطار",19))
        suraContent.add(Sura("المطففين",36))
        suraContent.add(Sura("الإنشقاق",25))
        suraContent.add(Sura("البروج",22))
        suraContent.add(Sura("الطارق",17))
        suraContent.add(Sura("الأعلى",19))
        suraContent.add(Sura("الغاشية",26))
        suraContent.add(Sura("الفجر",30))
        suraContent.add(Sura("البلد",20))
        suraContent.add(Sura("الشمس",15))
        suraContent.add(Sura("الليل",21))
        suraContent.add(Sura("الضحى",11))
        suraContent.add(Sura("الشرح",8))
        suraContent.add(Sura("التين",8))
        suraContent.add(Sura("العلق",19))
        suraContent.add(Sura("القدر",5))
        suraContent.add(Sura("البينة",8))
        suraContent.add(Sura("الزلزلة",8))
        suraContent.add(Sura("العاديات",11))
        suraContent.add(Sura("القارعة",11))
        suraContent.add(Sura("التكاثر",8))
        suraContent.add(Sura("العصر",3))
        suraContent.add(Sura("الهمزة",9))
        suraContent.add(Sura("الفيل",5))
        suraContent.add(Sura("قريش",4))
        suraContent.add(Sura("الماعون",7))
        suraContent.add(Sura("الكوثر",3))
        suraContent.add(Sura("الكافرون",6))
        suraContent.add(Sura("النصر",3))
        suraContent.add(Sura("المسد",5))
        suraContent.add(Sura("الإخلاص",4))
        suraContent.add(Sura("الفلق",5))
        suraContent.add(Sura("الناس",6))
    }

    fun initRecycler() {
        adapter = SuraNameAdapter(suraContent)
        adapter.onSuraClicklisenner = object : SuraNameAdapter.onItemClickLisenner {
            override fun onClick(sura: String, index: Int) {
                val intent = Intent(activity, SuraContentActivity::class.java)
                intent.putExtra(Constants.FILE_NAME, "${index + 1}.txt")
                intent.putExtra(Constants.SURA_NAME, sura)
                startActivity(intent)
            }
        }
        binding.rvAyaat.adapter = adapter
    }
}