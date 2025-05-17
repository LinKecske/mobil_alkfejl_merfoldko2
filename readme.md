## Lifecycle hook: 
- ShopListActivity osztályban az onDestroy()-ban: amikor kilépünk a mainActivity-be, akkor kiír egy üzenetet. 
## 2 android erőforrás, amihez premission kell:
- Termek1Activtiy-ben ha a képre rákattintasz, akkor letölti azt. 
- ShopListActivity-ben onAddContactClicked metódus és az ahhoz tartozó metódusok -> csinál egy Tech support névjegyet
## Notifications:
- Notification OK -> termek1Activity.java -> amikor a képet letöltöd. 
- Alarm manager OK -> ShopListActivity-be való belépés után 30 másodperccel megjelenik egy értesítés nehogy a vásárló elfelejtsen vásárolni. 

