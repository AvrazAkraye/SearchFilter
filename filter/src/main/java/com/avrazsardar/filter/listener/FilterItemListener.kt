package com.avrazsardar.filter.listener

import com.avrazsardar.filter.widget.FilterItem

/**
 * Created by galata on 08.09.16.
 */
interface FilterItemListener {

    fun onItemSelected(item: FilterItem)

    fun onItemDeselected(item: FilterItem)

    fun onItemRemoved(item: FilterItem)

}