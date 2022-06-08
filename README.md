# inventory-api-demo
Extremely Basic Hard Coded Inventory API Companion for Product API Demo

Instructions to build and run as a jar (from base directory):
  - $ ./gradlew bootJar
  - $ java -jar ./build/libs/(jarfile)

Alternatively (from base directory):
  - $ ./gradlew bootRun

Note - I had to run "$ chmod 755 gradlew" in a fresh ubuntu environment after cloning the repo to avoid permission issues


Usage:
- If you look at the InventoryController you can see it is hard-coded to return an inventory object only for IDs 1 and 2 (/inventories/1 and /inventories/2)
- Generally, this is very a bad idea, I've solely put this out here in case someone wants to run the product-api-demo and have a somewhat functional booking feature
