package com.szjz.StatePattern.state;

import com.szjz.StatePattern.Sportsman;

/**
 * 状态一般
 * @author 石中君子
 *
 */
public class StateCommon implements State {

	@Override
	public void state(Sportsman sportsman) {

		sportsman.setState(this);
	}

}
