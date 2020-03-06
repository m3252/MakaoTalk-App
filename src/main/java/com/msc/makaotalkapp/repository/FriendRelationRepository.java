package com.msc.makaotalkapp.repository;

import com.msc.makaotalkapp.domain.entity.FriendRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRelationRepository extends JpaRepository<FriendRelation, Long> {
}
