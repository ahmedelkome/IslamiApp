package com.route.islami_app.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.islami_app.R
import com.route.islami_app.adapters.SuraNameAdapter
import com.route.islami_app.constants.Constants
import com.route.islami_app.databinding.FragmentQuranBinding
import com.route.islami_app.model.Sura
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
        suraContent.add(Sura("الفاتحه", R.drawable.ic_makkah,7))
        suraContent.add(Sura("البقرة",R.drawable.ic_madina,286))
        suraContent.add(Sura("آل عمران",R.drawable.ic_madina,200))
        suraContent.add(Sura("النساء",R.drawable.ic_madina,200))
        suraContent.add(Sura("المائدة",R.drawable.ic_madina,120))
        suraContent.add(Sura("الأنعام",R.drawable.ic_makkah,165))
        suraContent.add(Sura("الأعراف",R.drawable.ic_makkah,206))
        suraContent.add(Sura("الأنفال",R.drawable.ic_madina,75))
        suraContent.add(Sura("التوبة",R.drawable.ic_madina,129))
        suraContent.add(Sura("يونس",R.drawable.ic_makkah,109))
        suraContent.add(Sura("هود",R.drawable.ic_makkah,123))
        suraContent.add(Sura("يوسف",R.drawable.ic_makkah,111))
        suraContent.add(Sura("الرعد",R.drawable.ic_madina,43))
        suraContent.add(Sura("إبراهيم",R.drawable.ic_makkah,52))
        suraContent.add(Sura("الحجر",R.drawable.ic_makkah,99))
        suraContent.add(Sura("النحل",R.drawable.ic_makkah,128))
        suraContent.add(Sura("الإسراء",R.drawable.ic_makkah,111))
        suraContent.add(Sura("الكهف",R.drawable.ic_makkah,110))
        suraContent.add(Sura("مريم",R.drawable.ic_makkah,98))
        suraContent.add(Sura("طه",R.drawable.ic_makkah,135))
        suraContent.add(Sura("الأنبياء",R.drawable.ic_makkah,112))
        suraContent.add(Sura("الحج",R.drawable.ic_madina,78))
        suraContent.add(Sura("المؤمنون",R.drawable.ic_makkah,118))
        suraContent.add(Sura("النور",R.drawable.ic_madina,64))
        suraContent.add(Sura("الفرقان",R.drawable.ic_makkah,77))
        suraContent.add(Sura("الشعراء",R.drawable.ic_makkah,227))
        suraContent.add(Sura("النمل",R.drawable.ic_makkah,93))
        suraContent.add(Sura("القصص",R.drawable.ic_makkah,88))
        suraContent.add(Sura("العنكبوت",R.drawable.ic_makkah,69))
        suraContent.add(Sura("الروم",R.drawable.ic_makkah,60))
        suraContent.add(Sura("لقمان",R.drawable.ic_makkah,34))
        suraContent.add(Sura("السجدة",R.drawable.ic_makkah,30))
        suraContent.add(Sura("الأحزاب",R.drawable.ic_madina,73))
        suraContent.add(Sura("سبأ",R.drawable.ic_makkah,54))
        suraContent.add(Sura("فاطر",R.drawable.ic_makkah,45))
        suraContent.add(Sura("يس",R.drawable.ic_makkah,83))
        suraContent.add(Sura("الصافات",R.drawable.ic_makkah,182))
        suraContent.add(Sura("ص",R.drawable.ic_makkah,88))
        suraContent.add(Sura("الزمر",R.drawable.ic_makkah,75))
        suraContent.add(Sura("غافر",R.drawable.ic_makkah,85))
        suraContent.add(Sura("فصلت",R.drawable.ic_makkah,54))
        suraContent.add(Sura("الشورى",R.drawable.ic_makkah,53))
        suraContent.add(Sura("الزخرف",R.drawable.ic_makkah,89))
        suraContent.add(Sura("الدخان",R.drawable.ic_makkah,59))
        suraContent.add(Sura("الجاثية",R.drawable.ic_makkah,37))
        suraContent.add(Sura("الأحقاف",R.drawable.ic_makkah,35))
        suraContent.add(Sura("محمد",R.drawable.ic_madina,38))
        suraContent.add(Sura("الفتح",R.drawable.ic_madina,29))
        suraContent.add(Sura("الحجرات",R.drawable.ic_madina,18))
        suraContent.add(Sura("ق",R.drawable.ic_makkah,45))
        suraContent.add(Sura("الذاريات",R.drawable.ic_makkah,60))
        suraContent.add(Sura("الطور",R.drawable.ic_makkah,49))
        suraContent.add(Sura("النجم",R.drawable.ic_makkah,62))
        suraContent.add(Sura("القمر",R.drawable.ic_makkah,55))
        suraContent.add(Sura("الرحمن",R.drawable.ic_madina,78))
        suraContent.add(Sura("الواقعة",R.drawable.ic_makkah,96))
        suraContent.add(Sura("الحديد",R.drawable.ic_madina,29))
        suraContent.add(Sura("المجادلة",R.drawable.ic_madina,22))
        suraContent.add(Sura("الحشر",R.drawable.ic_madina,24))
        suraContent.add(Sura("الممتحنة",R.drawable.ic_madina,13))
        suraContent.add(Sura("الصف",R.drawable.ic_madina,14))
        suraContent.add(Sura("الجمعة",R.drawable.ic_madina,11))
        suraContent.add(Sura("المنافقون",R.drawable.ic_madina,11))
        suraContent.add(Sura("التغابن",R.drawable.ic_madina,18))
        suraContent.add(Sura("الطلاق",R.drawable.ic_madina,12))
        suraContent.add(Sura("التحريم",R.drawable.ic_madina,12))
        suraContent.add(Sura("الملك",R.drawable.ic_makkah,30))
        suraContent.add(Sura("القلم",R.drawable.ic_makkah,52))
        suraContent.add(Sura("الحاقة",R.drawable.ic_makkah,52))
        suraContent.add(Sura("المعارج",R.drawable.ic_makkah,44))
        suraContent.add(Sura("نوح",R.drawable.ic_makkah,28))
        suraContent.add(Sura("الجن",R.drawable.ic_makkah,28))
        suraContent.add(Sura("المزمل",R.drawable.ic_makkah,20))
        suraContent.add(Sura("المدثر",R.drawable.ic_makkah,56))
        suraContent.add(Sura("القيامة",R.drawable.ic_makkah,40))
        suraContent.add(Sura("الإنسان",R.drawable.ic_madina,31))
        suraContent.add(Sura("المرسلات",R.drawable.ic_makkah,50))
        suraContent.add(Sura("النبأ",R.drawable.ic_makkah,40))
        suraContent.add(Sura("النازعات",R.drawable.ic_makkah,64))
        suraContent.add(Sura("عبس",R.drawable.ic_makkah,42))
        suraContent.add(Sura("التكوير",R.drawable.ic_makkah,29))
        suraContent.add(Sura("الإنفطار",R.drawable.ic_makkah,19))
        suraContent.add(Sura("المطففين",R.drawable.ic_makkah,36))
        suraContent.add(Sura("الإنشقاق",R.drawable.ic_makkah,25))
        suraContent.add(Sura("البروج",R.drawable.ic_makkah,22))
        suraContent.add(Sura("الطارق",R.drawable.ic_makkah,17))
        suraContent.add(Sura("الأعلى",R.drawable.ic_makkah,19))
        suraContent.add(Sura("الغاشية",R.drawable.ic_makkah,26))
        suraContent.add(Sura("الفجر",R.drawable.ic_makkah,30))
        suraContent.add(Sura("البلد",R.drawable.ic_makkah,20))
        suraContent.add(Sura("الشمس",R.drawable.ic_makkah,15))
        suraContent.add(Sura("الليل",R.drawable.ic_makkah,21))
        suraContent.add(Sura("الضحى",R.drawable.ic_makkah,11))
        suraContent.add(Sura("الشرح",R.drawable.ic_makkah,8))
        suraContent.add(Sura("التين",R.drawable.ic_makkah,8))
        suraContent.add(Sura("العلق",R.drawable.ic_makkah,19))
        suraContent.add(Sura("القدر",R.drawable.ic_makkah,5))
        suraContent.add(Sura("البينة",R.drawable.ic_madina,8))
        suraContent.add(Sura("الزلزلة",R.drawable.ic_madina,8))
        suraContent.add(Sura("العاديات",R.drawable.ic_makkah,11))
        suraContent.add(Sura("القارعة",R.drawable.ic_makkah,11))
        suraContent.add(Sura("التكاثر",R.drawable.ic_makkah,8))
        suraContent.add(Sura("العصر",R.drawable.ic_makkah,3))
        suraContent.add(Sura("الهمزة",R.drawable.ic_makkah,9))
        suraContent.add(Sura("الفيل",R.drawable.ic_makkah,5))
        suraContent.add(Sura("قريش",R.drawable.ic_makkah,4))
        suraContent.add(Sura("الماعون",R.drawable.ic_makkah,7))
        suraContent.add(Sura("الكوثر",R.drawable.ic_makkah,3))
        suraContent.add(Sura("الكافرون",R.drawable.ic_makkah,6))
        suraContent.add(Sura("النصر",R.drawable.ic_madina,3))
        suraContent.add(Sura("المسد",R.drawable.ic_makkah,5))
        suraContent.add(Sura("الإخلاص",R.drawable.ic_makkah,4))
        suraContent.add(Sura("الفلق",R.drawable.ic_makkah,5))
        suraContent.add(Sura("الناس",R.drawable.ic_makkah,6))
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