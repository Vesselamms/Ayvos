Feature: İletişim

  Scenario:İletişim sayfasını doğrula

          Given kullanici ana sayfaya erisebilmeli
          When kullanici sayfa sonunda bulunan "iletişim" modulune tiklayabilmeli
          Then kullanici url kismini "https://ayvos.com/about-us" seklinde gormeli

  Scenario: Iletisim Alanlarını Doldur
          Given Kullanici iletisim sayfasinda
          When Kullanici Mesaj Gonder bolumunde bulunan
          And "Ad Soyad" kismina isim soyismini yazmali
          And "E-mail" kismina  mail adresini yazmali
          And "Telefon" kismina telefon numarisini yazmali
          Then Kullanici Gonder butonuna bastiginda "https://ayvos.com/about-us?" URL yi gormeli