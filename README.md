# SpringBoot-Project
Spring Boot - Gelişmiş Programlama Ödevi
Bu proje, İstanbul Aydın Üniversitesi Advanced Programming dersi kapsamında geliştirilmiş, katmanlı mimari (Layered Architecture) prensiplerine dayanan bir Spring Boot uygulamasıdır.

 Kullanılan Teknolojiler
Java 17+

Spring Boot 3.x (Web, Data JPA)

Veritabanı: MySQL

Araçlar: Maven, IntelliJ IDEA, MySQL Workbench

 Proje Yapısı ve Mimari
Uygulama, sürdürülebilir ve test edilebilir bir yapı için 4 ana katman üzerine inşa edilmiştir:

Entity (Model): Veritabanı tablolarının Java sınıfları olarak temsil edildiği katman.

Repository: Spring Data JPA kullanılarak veritabanı işlemlerinin (CRUD) yönetildiği katman.

Service: İş mantığının (Business Logic) yürütüldüğü ve katmanlar arası iletişimin sağlandığı bölüm.

Controller (API): HTTP isteklerini karşılayan ve dış dünyaya veri sunan REST uç noktaları.
