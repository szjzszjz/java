package com.szjz.StatePattern.state;

import com.szjz.StatePattern.Sportsman;

/**
 * ״̬һ��
 * @author ʯ�о���
 *
 */
public class StateCommon implements State {

	@Override
	public void state(Sportsman sportsman) {

		sportsman.setState(this);
	}

}
