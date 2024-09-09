// package com.campusbike.campusbike.domain.entities;





// package com.surveysc.surveysc.domain.entities;

// import java.util.List;

// import com.fasterxml.jackson.annotation.JsonIgnore;

// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Column;
// import jakarta.persistence.Embedded;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.Table;


// @Entity
// public class Comprasdet {

//     @Id
//     @GeneratedValue(strategy =  GenerationType.IDENTITY)
//     private Long id;

//     @ManyToOne
//     @JoinColumn(name = "chapter_id")
//     private Chapter chapters;

//     @Column(columnDefinition = "VARCHAR(10)", nullable = false)
//     private String questionNumber;

//     @Column(columnDefinition = "VARCHAR(10)", nullable = false)
//     private String responseType;

//     @Column(columnDefinition = "TEXT", nullable = false)
//     private String commentQuestion;

//     @Column(columnDefinition = "TEXT", nullable = false)
//     private String questionText;

//     @Embedded
//     private Audit audit = new Audit();

//     @OneToMany(mappedBy = "questions", cascade = CascadeType.ALL, orphanRemoval = true)
//     @JsonIgnore // Evitar que se serialice la lista de capítulos
//     private List<ResponseOption> responses;

//     public Question() {
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public Chapter getChapters() {
//         return chapters;
//     }

//     public void setChapters(Chapter chapters) {
//         this.chapters = chapters;
//     }

//     public String getQuestionNumber() {
//         return questionNumber;
//     }

//     public void setQuestionNumber(String questionNumber) {
//         this.questionNumber = questionNumber;
//     }

//     public String getResponseType() {
//         return responseType;
//     }

//     public void setResponseType(String responseType) {
//         this.responseType = responseType;
//     }

//     public String getCommentQuestion() {
//         return commentQuestion;
//     }

//     public void setCommentQuestion(String commentQuestion) {
//         this.commentQuestion = commentQuestion;
//     }

//     public String getQuestionText() {
//         return questionText;
//     }

//     public void setQuestionText(String questionText) {
//         this.questionText = questionText;
//     }

//     public Audit getAudit() {
//         return audit;
//     }

//     public void setAudit(Audit audit) {
//         this.audit = audit;
//     }

   
// }
