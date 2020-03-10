package com.msc.makaotalkapp.repository;

import com.msc.makaotalkapp.domain.entity.Chat;
import com.msc.makaotalkapp.domain.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {

}
