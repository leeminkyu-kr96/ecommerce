package com.loopers.application.point;

import com.loopers.domain.point.PointModel;
import com.loopers.domain.point.PointService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PointFacade {
    private final PointService pointService;

    // public UserInfo getUser(String userId) {
    //     UserModel user = userService.chkDuplicateUserId(userId);
    //     return UserInfo.from(user);
    // }
}
