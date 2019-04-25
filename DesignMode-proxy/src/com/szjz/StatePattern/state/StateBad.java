package com.szjz.StatePattern.state;

import com.szjz.StatePattern.Sportsman;

/**
 * 状态很差
 * @author 石中君子
 *
 */
public class StateBad implements State {

	@Override
	public void state(Sportsman sportsman) {

		sportsman.setState(this);
	}

}
