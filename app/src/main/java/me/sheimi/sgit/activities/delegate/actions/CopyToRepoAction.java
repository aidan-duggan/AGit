package me.sheimi.sgit.activities.delegate.actions;

import android.content.Intent;

import java.io.IOException;

import me.sheimi.android.activities.SheimiFragmentActivity;
import me.sheimi.sgit.R;
import me.sheimi.sgit.activities.RepoDetailActivity;
import me.sheimi.sgit.database.models.Repo;
import timber.log.Timber;

/**
 * Created by Aidan on 02/09/2018.
 */

public class CopyToRepoAction extends RepoAction {

    public CopyToRepoAction(Repo mRepo, RepoDetailActivity mActivity) {
        super(mRepo, mActivity);
    }

    @Override
    public void execute() {
        mActivity.closeOperationDrawer();

        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("*/*");
        mActivity.startActivityForResult(Intent.createChooser(intent, "Choose file"), mActivity.getSelectFileIntentId());
    }
}
