package com.scatl.uestcbbs.callback;

import com.scwang.smartrefresh.layout.api.RefreshLayout;


public interface OnRefresh {
    void onRefresh(RefreshLayout refreshLayout);
    void onLoadMore(RefreshLayout refreshLayout);
}
