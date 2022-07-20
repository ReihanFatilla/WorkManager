package com.example.workmanagerdemo1

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.lang.Exception


class UploadWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {

    companion object {
        const val KEY_WORKER = "key_worker"
    }

    override fun doWork(): Result {
        return try {


            Result.success()
        } catch (e: Exception) {
            Result.failure()
        }
    }
}