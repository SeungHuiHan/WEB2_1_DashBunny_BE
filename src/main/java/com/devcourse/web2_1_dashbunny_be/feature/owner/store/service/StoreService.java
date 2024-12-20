package com.devcourse.web2_1_dashbunny_be.feature.owner.store.service;


import com.devcourse.web2_1_dashbunny_be.domain.owner.StoreManagement;
import com.devcourse.web2_1_dashbunny_be.feature.owner.dto.store.*;

import java.util.List;

/**
 * 가게 관리를 위한 service interface.
 */
public interface StoreService {

  /**
   * 기본 정보를 반환 api service.
   */
  BasicInfoProjection getBasicStoreInfo(String storeId);

  /**
   * 기본 정보 수정을 위한 api service.
   */
  void updateBasicInfo(String storeId, UpdateBasicInfoRequestDto updateBasicInfo);

  /**
   *가게 운영 정보 조회를 위한 api service.
   */
  OperationInfoListResponseDto findOperationInfo(String storeId);

  /**
   *가게 운영 정보 수정을 위한 api service.
   */
  void addOperationInfo(String storeId, CreateOperationInfoResponseDto operationInfo);

  /**
   *가게 운영 일시정지를 위한 api service.
   */
  void updatePauseTime(String storeId, UpdatePauseTimeRequestDto pauseTimeDto);

  /**
   *가게 운영 재시작 위한 api service.
   */
  void updateResumeTime(String storeId);

  /**
  * 가게 리스트 페이지에서 내 가게 전체 조회를 위한 api service.
  */
  List<StoreManagementListDto> findAllStore(String phone);
}
