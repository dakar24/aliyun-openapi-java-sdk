/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.codeup.transform.v20200414;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.codeup.model.v20200414.ListGroupMemberResponse;
import com.aliyuncs.codeup.model.v20200414.ListGroupMemberResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupMemberResponseUnmarshaller {

	public static ListGroupMemberResponse unmarshall(ListGroupMemberResponse listGroupMemberResponse, UnmarshallerContext _ctx) {
		
		listGroupMemberResponse.setRequestId(_ctx.stringValue("ListGroupMemberResponse.RequestId"));
		listGroupMemberResponse.setErrorCode(_ctx.stringValue("ListGroupMemberResponse.ErrorCode"));
		listGroupMemberResponse.setSuccess(_ctx.booleanValue("ListGroupMemberResponse.Success"));
		listGroupMemberResponse.setErrorMessage(_ctx.stringValue("ListGroupMemberResponse.ErrorMessage"));
		listGroupMemberResponse.setTotal(_ctx.longValue("ListGroupMemberResponse.Total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupMemberResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccessLevel(_ctx.integerValue("ListGroupMemberResponse.Result["+ i +"].AccessLevel"));
			resultItem.setExternUserId(_ctx.stringValue("ListGroupMemberResponse.Result["+ i +"].ExternUserId"));
			resultItem.setId(_ctx.longValue("ListGroupMemberResponse.Result["+ i +"].Id"));
			resultItem.setState(_ctx.stringValue("ListGroupMemberResponse.Result["+ i +"].State"));
			resultItem.setAvatarUrl(_ctx.stringValue("ListGroupMemberResponse.Result["+ i +"].AvatarUrl"));
			resultItem.setEmail(_ctx.stringValue("ListGroupMemberResponse.Result["+ i +"].Email"));

			result.add(resultItem);
		}
		listGroupMemberResponse.setResult(result);
	 
	 	return listGroupMemberResponse;
	}
}