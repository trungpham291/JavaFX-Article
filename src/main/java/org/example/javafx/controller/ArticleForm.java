package org.example.javafx.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.example.javafx.Repository.ArticleRepository;
import org.example.javafx.entity.Article;
import org.example.javafx.Repository.ArticleRepository;

public class ArticleForm {
    public TextField txtTitle;
    public TextField txtDescription;
    public TextField txtContent;
    private ArticleRepository articleRepository = new ArticleRepository();


    public void processSave(ActionEvent actionEvent) {
        Article article = new Article();
        article.setTitle(txtTitle.getText());
        article.setDescription(txtDescription.getText());
        article.setContent(txtContent.getText());
        articleRepository.save(article);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Action Success");
        alert.setHeaderText("Article Saved");
        alert.show();
        reset();
    }

    public void processReset(ActionEvent actionEvent) {
        reset();
    }
    private void reset() {
        txtTitle.clear();
        txtDescription.clear();
        txtContent.clear();
    }
}