package me.sheimi.sgit.activities.delegate.actions;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import me.sheimi.android.activities.SheimiFragmentActivity;
import me.sheimi.sgit.R;
import me.sheimi.sgit.activities.RepoDetailActivity;
import me.sheimi.sgit.database.models.Repo;
import timber.log.Timber;

/**
 * Created by aduggan on 11/08/2017.
 */

public class TemplateAction extends RepoAction {

    public TemplateAction(Repo repo, RepoDetailActivity activity) {
        super(repo, activity);
    }

    @Override
    public void execute() {
        mActivity.showEditTextDialog(R.string.dialog_create_file_from_template_title,
            R.string.dialog_create_file_hint, R.string.label_create,
            new SheimiFragmentActivity.OnEditTextDialogClicked() {
                @Override
                public void onClicked(String text) {
                    File newFile;
                    try {
                        newFile = mActivity.getFilesFragment().newFile(text);
                    } catch (IOException e) {
                        Timber.e(e);
                        mActivity.showMessageDialog(R.string.dialog_error_title,
                            mActivity.getString(R.string.error_something_wrong));
                        return;
                    }

                    try {
                        String content = mActivity.getFilesFragment().readFile("_diaryTemplate.tp");
                        FileUtils.writeStringToFile(newFile, content);
                    } catch (Exception e) {
                        Timber.e(e);
                        mActivity.showMessageDialog(R.string.dialog_error_title,
                            e.getMessage());
                    }
                }
            });
        mActivity.closeOperationDrawer();
    }
}
