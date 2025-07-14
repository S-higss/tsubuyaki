package jp.kobe_u.cs.daikibo.tsubuyaki.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.kobe_u.cs.daikibo.tsubuyaki.entity.Tsubuyaki;

@Repository
public interface TsubuyakiRepository extends CrudRepository<Tsubuyaki, Long>{
    // CrudRepositoryを継承することで、基本的なCRUD操作が提供される
    // 追加のクエリメソッドは必要に応じて定義可能
    // 例: List<Tsubuyaki> findByName(String name);
    List<Tsubuyaki> findByCommentContainingIgnoreCase(String keyword); // コメントにキーワードを含むつぶやきを検索
    // キーワードを含むつぶやきを検索するメソッド
    // findByCommentContainingIgnoreCaseは、コメントにキーワードを含むつぶやきを検索するためのメソッド
    // このメソッドは、Spring Data JPAが自動的に実装するクエリメソッドです。
}  