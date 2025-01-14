package com.example.ph44766_lab6.screens.component

import android.content.ClipData.Item
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ph44766_lab6.ItemRow
import com.example.ph44766_lab6.data.SourceApp
import com.example.ph44766_lab6.screens.component.component.ItemRow

@Composable
fun ListGrid() {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2)
    ) {
        items(SourceApp.data) { item -> ItemRow(item = item) }
    }
}