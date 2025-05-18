# Segítség a javításhoz
## Adatmodell definiálása:
- Item class
## Layout típusok:
- Constraint layout (kb mindenhol)
- Relative layout (activity_register.xml)
## Animáció:
- Nincs, ne keresd
## Lifecycle hook: 
- ShopListActivity osztályban az onDestroy()-ban: amikor kilépünk a mainActivity-be, akkor kiír egy üzenetet. 
## 2 android erőforrás, amihez premission kell:
- Termek1Activtiy-Termek3Activity-ben ha a képre rákattintasz, akkor letölti azt. (előtte engedélyt kér) 
- ShopListActivity-ben onAddContactClicked metódus és az ahhoz tartozó metódusok -> csinál egy Tech support névjegyet (előtte engedélyt kér)
## Háttérszolgáltatások:
- Notification -> termek1Activity.java-ban, amikor a képet letöltöd kapsz egy értesítést
- Alarm manager -> ShopListActivity-be való belépés után 30 másodperccel megjelenik egy értesítés nehogy a vásárló elfelejtsen vásárolni. 
## CRUD műveletek:
- Nincs, ne keresd
## Komplex firestroe lekérdezések:
- Nincs, ne keresd
## Szubjektív pontozás:
- Légyszi úgy, hogy meglegyen a 27.5 :)

