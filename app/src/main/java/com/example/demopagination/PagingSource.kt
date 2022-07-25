package com.example.demopagination

import androidx.paging.PagingSource
import androidx.paging.PagingState

class Paging_Source(var retro_service: Retro_Service) : PagingSource<Int, Results>() {

    override fun getRefreshKey(state: PagingState<Int, Results>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: androidx.paging.PagingSource.LoadParams<Int>): androidx.paging.PagingSource.LoadResult<Int, Results> {
        var currentpos = params.key ?: 1
        var data = retro_service.getdata(currentpos)
        return androidx.paging.PagingSource.LoadResult.Page(data = data.results,
            prevKey = if (currentpos == 1) null else currentpos - 1,
            nextKey = if (false) null else currentpos + 1)
    }

}
