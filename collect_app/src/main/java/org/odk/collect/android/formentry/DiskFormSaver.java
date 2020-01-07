package org.odk.collect.android.formentry;

import android.net.Uri;

import org.odk.collect.android.tasks.SaveToDiskTaskResult;
import org.odk.collect.android.tasks.SaveToDiskTask;

public class DiskFormSaver implements FormSaver {

    @Override
    public SaveToDiskTaskResult save(Uri uri, boolean complete, String updatedSaveName, boolean exitAfter, ProgressListener progressListener) {
        SaveToDiskTask saveToDiskTask = new SaveToDiskTask(uri, complete, exitAfter, updatedSaveName);
        return saveToDiskTask.saveForm(progressListener);
    }
}
