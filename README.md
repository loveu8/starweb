Spring boot service add Module Code Desgin
================
We write the code, and you may be refactor your code on someday.
This project using my module design. It's a example. It can help your code to module. And you can change or refactor your module code get easy. Hope this help you.
------------------------------------------------
Step 1
Create your package what yor would like to, and create one or many class to extends
com.star.web.module.Module

Step 2
Create you moulde collect data class , add to com.star.web.module.ModuleCollectType.java
I recommand create only one class to collect.

Step 3
Write you module code. And use the Utils_Module.java. To let your moudle code pass or save the data.

Step 4
Create your manage class to put your module code and ModuleCollectType

Final
Run your code and test.
---
local Test
com.star.web.module.race.Test.java

Web Test
http://localhost:7070/module-test