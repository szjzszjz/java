package com.szjz.StatePattern.state;

import com.szjz.StatePattern.Sportsman;

/**
 * 状态很棒
 * @author 石中君子
 *
 */
public class StateGood implements State {

	@Override
	public void state(Sportsman sportsman) {

		sportsman.setState(this);
	}

}
