Spring boot service add Module Code Desgin
================
We write the code, and you may be refactor your code on someday.
This project using my module design. It's a example. It can help your code to module. And you can change or refactor your module code get easy. Hope this help you.
------------------------------------------------
Step 1<br>
Create your package what yor would like to, and create one or many class to extends.<br>
com.star.web.module.Module<br>
<br>
Step 2<br>
Create you moulde collect data class , add to com.star.web.module.ModuleCollectType.java.<br>
I recommand create only one class to collect.<br>
<br>
Step 3<br>
Write you module code. And use the Utils_Module.java. To let your moudle code pass or save the data.<br>
<br>
Step 4<br>
Create your manage class to put your module code and ModuleCollectType.<br>
<br>
Final<br>
Run your code and test.<br>
<br>
local Test<br>
com.star.web.module.race.Test.java<br>
<br>
Web Test<br>
http://localhost:7070/module-test<br>