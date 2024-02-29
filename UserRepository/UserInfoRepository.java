package com.example.Mapping.UserRepository;

import com.example.Mapping.UserEntity.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo,Long>
{

}
