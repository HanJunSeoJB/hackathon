package com.example.databaseexam;

import android.provider.BaseColumns;

public final class Memo {
    private Memo() {

    }
    public static class MemoEntey implements BaseColumns {
        public static final String TABLE_NAME = "memo";
        public static final String COLUM_NAME_TITLE = "title";
        public static final String COLUM_NAME_CONTENTS = "contents";
    }
}
