# 3. semester SP opgave 02 
## - gruppe 4 (kun for piger - og Frederik)

### Introduktion til projetet 
Projektet er en SP02 opgave på datamatikeruddannelsens 3. semester (CPH Business). 
Overordnet set handler projetktet om at trække data fra en hjemmeside og gemme data på en database. Altså webscraping (datamining) og brug af Rest API.
Teknologierne der er anvendt i projektet, samt applikationens lag er beskrevet nedenfor, og vil derfor ikke fylde noget i introduktionen. 

> Porjektdeltagerne er:<br>
> Natasja Vitoft <br>
> Veronika Minddal <br>
> Signe K. Larsen <br>
> Frederik G. Johannessen

### Business Idea 
Firmanavn: **Data Girls - powerd by data**.

Ved hjælp af data, vi snedigt skraber fra vejtjenester, spår vi i kaffegrumsen (eller rettere i skyerne) for at afdække, hvor i Danmark regndråberne næste gang vil danse. Og voila! Når skyerne samler sig, og regnen begynder at falde, er vi klar til at målrette salget af de mest stilfulde paraplyer, komfortable gummistøvler og effektive regnslag - alt sammen fra den eksklusive spanske producent, **RainMain!**


### Vi vil anvende følgende teknologier
![Java](https://img.shields.io/badge/Java-%23FF0000?style=flat-square&logo=java&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-%23336791?style=flat-square&logo=postgresql&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-%23000000?style=flat-square&logo=intellij-idea&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-%23181717?style=flat-square&logo=github&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-%23C71A36?style=flat-square&logo=apache-maven&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-%23008000?style=flat-square&logoColor=white)
![Jsoup](https://img.shields.io/badge/Jsoup-%23008000?style=flat-square&logoColor=white)
![Javalin](https://img.shields.io/badge/Javalin-%230056D6?style=flat-square&logoColor=white)


### Apllikationens lag
![3_Sem_SP02_app](https://github.com/FrederikGJ/3sem_sp02/assets/113090989/a802b741-d6f3-46db-a20c-955c31925af3)

### EER diagram

### APIer som vi har brugt til at hente data fra
https://dawadocs.dataforsyningen.dk/dok/api/sted <br>
https://vejr.eu/pages/api-documentation

### Projektarbejdet 
Til at starte med organiserede vi projektet. Vi lavede en ufromel gennemgang af det der af Pressman og Maxim kaldes for The Process Framework (Pressman & Maxim, 2014, s. 10-11).
> The Process Framework indeholder følgende kategorier <br>
> Communication, Planning, Modeling, Construction og Deployment <br>
> (Pressman & Maxim, 2014, s. 10-11)

I vores projekt har vi gjort brug af et design pattern, <br>
Et designpattern kan have følgende formelle beskrivelse: *"asdfasdfasdf asdfasdfasdf asdfasdfasdfasdf "* (Pressman & Maxim, 2014, s. 164)
<br>
Vores DAO objekter følger singleton pattern, da vi kun laver en global instans, som man så henter med getInstace() metoden på klassen. 

Vi har brugt GitHub til versionsstyring, hvor vi hver isæt anvendte feature branches, som vi senere mergede sammen i produktionen (Main). 

### Litteraturliste
Pressman, R.S. and Maxim, B., 2014. Software Engineering: A Practitioner's Approach, 9th ed. [New York].
