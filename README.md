# BrailleDatabase - Java

This is no longer maintained. Future work will be done exclusively on the Kotlin version (https://github.com/Brailliac/BrailleDatabaseKotlin)

Java database of Braille codes, and associated data and utility classes.
Includes bi-directional translator.

Currently featuring the following Braille codes:
- UEB
- Czech
- Slovak
- Spanish
- Swedish
- Tamil

# Braille info

The numbering of Braille dots is shown here:
https://cdn.shopify.com/s/files/1/0543/5261/products/image_d1b3a9ff-bb2a-4fc6-bd63-46b1562d252c.jpg?v=1403641507

# Adding new codes

I am always looking for people to help add new languages and Braille codes!

Go to https://github.com/Brailliac/BrailleDatabase/tree/master/java/com/lukeneedham/brailledatabase/brailledatabase/SymbolDatabases and create a new file named: \*SymbolDatabase.java where * is the name, in English, of the new Braille database. You can  copy the code from an existing SymbolDatabase file as a template, and tweak it for your new database.

Check out the files in https://github.com/Brailliac/BrailleDatabase/tree/master/java/com/lukeneedham/brailledatabase/brailledatabase to see how the data classes work, in particular BrailleSymbolDataEntry.

If you need any information, please contact me at brailletutorapp@gmail.com

# Kotlin

The Kotlin version of the database is written using a Kotlin DSL - so is much easier to read and contribute to. It can be found here: https://github.com/Brailliac/BrailleDatabaseKotlin
