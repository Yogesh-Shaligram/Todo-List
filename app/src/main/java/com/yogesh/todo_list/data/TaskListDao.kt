package com.yogesh.todo_list.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface TaskListDao{
    @Query("SELECT * FROM task WHERE status = :status ORDER BY priority DESC")
    fun getTasksByPriority(status: Int): LiveData<List<Task>>

    @Query("SELECT * FROM task WHERE status = :status ORDER BY title")
    fun getTasksByTitle(status: Int): LiveData<List<Task>>
}