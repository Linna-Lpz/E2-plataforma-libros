package com.libros.libros.models;

public class Ranking {
	private Integer id_ranking;
	private Integer fk_id_libro;

    public Integer getId_ranking() {
        return id_ranking;
    }
    public void setId_ranking(Integer id_ranking) {
        this.id_ranking = id_ranking;
    }
    public Integer getFk_id_libro() {
        return fk_id_libro;
    }
    public void setFk_id_libro(Integer fk_id_libro) {
        this.fk_id_libro = fk_id_libro;
    }

}
