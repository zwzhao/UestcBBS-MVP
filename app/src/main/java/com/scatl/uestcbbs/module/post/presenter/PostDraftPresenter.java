package com.scatl.uestcbbs.module.post.presenter;

import android.content.Context;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;

import com.scatl.uestcbbs.base.BasePresenter;
import com.scatl.uestcbbs.module.post.view.PostDraftView;

/**
 * author: sca_tl
 * description:
 * date: 2020/2/14 20:38
 */
public class PostDraftPresenter extends BasePresenter<PostDraftView> {

    public void deleteDraft(Context context, int position) {
        final AlertDialog dialog = new AlertDialog.Builder(context)
                .setNegativeButton("确认", null)
                .setPositiveButton("取消", null )
                .setTitle("删除草稿")
                .setMessage("确认删除该草稿嘛？删除后不可恢复")
                .create();
        dialog.setOnShowListener(dialogInterface -> {
            Button n = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
            n.setOnClickListener(v -> {
                dialog.dismiss();
                view.onDeleteConfirm(position);
            });
        });
        dialog.show();
    }

}
