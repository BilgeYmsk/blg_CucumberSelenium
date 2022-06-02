package com.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "de.monochromata.cucumber.report.PrettyReports:target/cucumber",
//                "html:target/default-html-reports" yukariya virgül koyup bunu yazinca default htm report package i geliyor.
                "rerun:target/rerun.txt" //testimizde basarisiz olan dosyalarimizi target icerisinde hatali senaryonun satirina kadar görmüs olacagiz
        }, //rapor almak icin yaziyoruz
        features = "src/test/resources/features",
        glue = "com/step_definitions",
//        dryRun = true       //bunu yazarak kodu yazilmis olan kodlari devre disi birakip , sadece eksik olanlari verecek!!
                            // kodu yazilmayanin  tamamlamamizi istedigi metod kismini gösterir,
        dryRun = false ,  // eksik olan dahil her kod calisir!eksik olanin kodunu almak icin hepsinin calismasina gerek yok.
//        tags = "@teacher" //sadece teacher etiketli olani calistirir!
//        tags = "@teacher or @student"  //üzerinde teacher ya da student olan hangi metod varsa onu calistir!Tek dogru yeter!
//        tags = "@wip and @smoke"       // üzerinde wip VE smoke etiketi olanlari calistir! ikiside olmak zorunda!
//        tags = "@wip and @smoke"       // Before version 4 -->syntex i -->{"@wip","@smoke"} --and
//        tags = "@wip or @smoke"       // üzerinde @wip  ya da  @smoke olan hanigileriyse onu calistir
//        tags = "@wip or @smoke"       // Before version 5--> syntex i bu sekilde "@wip","@smoke" --or
//        tags =  "@smoke and not @wip"  //smoke calisacak ama wip ler calismayacak
//        tags =  "@smoke and not @wip"  //Before version 5 -->{"@smoke" , "~wip"}  and not (~tilda isareti klavyeden alt+126)
//        tags="@Developer or @AllPost or @Dashboard" //benim ilk yaptigim sekildeki etiketlerin oldugu senaryolar calisiyor!!
        tags = "@list"  //feature dosyasinida dosya basina koyulan etiketin bagli oldugu class daki herseyi calistirir!!



)

public class CukesRunner { //burayi görmek icin bir kez run edip consoldaki method isimlerini koplayalip kullaniriz


}
