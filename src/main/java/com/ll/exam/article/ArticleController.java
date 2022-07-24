package com.ll.exam.article;

import com.ll.exam.Rq;

public class ArticleController {
    public void showList(Rq rq) {
        rq.appendBody("List of posts");
    }
}
