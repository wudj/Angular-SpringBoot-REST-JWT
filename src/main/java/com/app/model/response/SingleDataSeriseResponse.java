//This is a common http response model for providing data series

package com.app.model.response;

import java.util.List;

import com.app.model.data.SingleSerise;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class SingleDataSeriseResponse extends OperationResponse {
    private List<SingleSerise> items;
}
