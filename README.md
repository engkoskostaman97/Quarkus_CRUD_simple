# crud-quarkus

Proyek ini menggunakan Quarkus, Kerangka Java Subatomik Supersonik.
Jika Anda ingin mempelajari lebih lanjut tentang Quarkus, silakan kunjungi situs webnya: https://quarkus.io/ .

## Running the application in dev mode


Anda dapat menjalankan aplikasi Anda dalam mode pengembangan yang memungkinkan pengkodean langsung menggunakan:
``` skrip cangkang
./mvnw kompilasi quarkus:dev
```

> **_NOTE:_** Quarkus kini dikirimkan dengan UI Pengembang, yang tersedia dalam mode pengembang hanya di http://localhost:8080/q/dev/.

## Packaging and running the application

Aplikasi dapat dikemas menggunakan:
``` skrip cangkang
paket ./mvnw
```
Ini menghasilkan file `quarkus-run.jar` di direktori `target/quarkus-app/`.
Perlu diketahui bahwa ini bukan _über-jar_ karena dependensinya disalin ke direktori `target/quarkus-app/lib/`.

Aplikasi sekarang dapat dijalankan menggunakan `java -jar target/quarkus-app/quarkus-run.jar`.

Jika Anda ingin membuat _über-jar_, jalankan perintah berikut:
``` skrip cangkang
./mvnw paket -Dquarkus.package.type=uber-jar
```

Aplikasi, yang dikemas sebagai _über-jar_, kini dapat dijalankan menggunakan `java -jar target/*-runner.jar`.

## Creating a native executable

Anda dapat membuat executable asli menggunakan:
``` skrip cangkang
./mvnw paket -Dnative
```

Atau, jika Anda belum menginstal GraalVM, Anda dapat menjalankan build asli yang dapat dieksekusi dalam sebuah container menggunakan:
``` skrip cangkang
./mvnw paket -Dnative -Dquarkus.native.container-build=true
```

Anda kemudian dapat mengeksekusi executable asli Anda dengan: `./target/crud-quarkus-1.0.0-SNAPSHOT-runner`

Jika Anda ingin mempelajari lebih lanjut tentang membuat executable asli, silakan lihat https://quarkus.io/guides/maven-tooling.

## Related Guides

- Hibernate ORM dengan Panache ([panduan](https://quarkus.io/guides/hibernate-orm-panache)): Sederhanakan kode persistensi Anda untuk Hibernate ORM melalui catatan aktif atau pola repositori
- Driver JDBC - PostgreSQL ([panduan](https://quarkus.io/guides/datasource)): Hubungkan ke database PostgreSQL melalui JDBC

## Provided Code

### Hibernate ORM

Buat entitas JPA pertama Anda

[Bagian panduan terkait...](https://quarkus.io/guides/hibernate-orm)

[Bagian Hibernasi dengan Panache terkait...](https://quarkus.io/guides/hibernate-orm-panache)


### RESTEasy Reactive

Buat entitas JPA pertama Anda

[Bagian panduan terkait...](https://quarkus.io/guides/hibernate-orm)

[Bagian Hibernasi dengan Panache terkait...](https://quarkus.io/guides/hibernate-orm-panache)


#Akses Swagger Ui link to :
http://localhost:8080/q/swagger-ui/

Recomded Belajar Materi in link:
https://www.mastertheboss.com/soa-cloud/quarkus/how-to-generate-jax-rs-crud-application-in-quarkus-using-panache/

Database conection to Postgresql:

![image](https://github.com/engkoskostaman97/Quarkus_CRUD_simple/assets/110719940/e5e16f89-e1be-4284-98bc-9aaec4140be8)


Testing PostMant:
- POST
  
![image](https://github.com/engkoskostaman97/Quarkus_CRUD_simple/assets/110719940/98042a78-e99f-4582-93e6-8220efac0d39)

- PUT
  
![image](https://github.com/engkoskostaman97/Quarkus_CRUD_simple/assets/110719940/e811f383-eece-41e9-a3f8-57c7d3aa47bf)




