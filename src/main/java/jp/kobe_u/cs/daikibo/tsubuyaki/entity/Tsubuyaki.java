package jp.kobe_u.cs.daikibo.tsubuyaki.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import java.util.Date;

@Data
@Entity

public class Tsubuyaki {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id; //つぶやきエンティティの識別子
  String name;    //名前
  String comment; //コメント
  @Temporal(TemporalType.TIMESTAMP)
  Date createdAt; //作成日時
}