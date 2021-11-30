package cz.utb.fai.roomwordsample

import android.app.Application
import cz.utb.fai.roomwordsample.database.WordRoomDatabase

class WordsApplication : Application() {
    // Using by lazy so the database and the repository are only created when they're needed
    // rather than when the application starts
    val database by lazy { WordRoomDatabase.getDatabase(this) }
    val repository by lazy { WordRepository(database.wordDao()) }
}